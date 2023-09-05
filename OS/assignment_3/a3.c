#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MAX_PROCESS 10

typedef struct {
    int pid;
    int arrival_time;
    int cpu_burst;
    int priority;
    int turnaround_time;
    int waiting_time;
} Process;

void swap(Process *a, Process *b) {
    Process temp = *a;
    *a = *b;
    *b = temp;
}

void sort_by_priority(Process processes[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (processes[j].priority > processes[j + 1].priority) {
                swap(&processes[j], &processes[j + 1]);
            }
        }
    }
}

void calculate_turnaround_time(Process processes[], int n) {
    int total_waiting_time = 0;
    for (int i = 0; i < n; i++) {
        processes[i].turnaround_time = processes[i].waiting_time + processes[i].cpu_burst;
        total_waiting_time += processes[i].waiting_time;
    }
    double avg_waiting_time = (double)total_waiting_time / n;
    printf("\nAverage Waiting Time: %.2lf\n", avg_waiting_time);
}

void calculate_waiting_time(Process processes[], int n) {
    processes[0].waiting_time = 0;
    for (int i = 1; i < n; i++) {
        processes[i].waiting_time = processes[i - 1].waiting_time + processes[i - 1].cpu_burst;
    }
}

void generate_random_cpu_burst(Process processes[], int n) {
    srand(time(NULL));
    for (int i = 0; i < n; i++) {
        processes[i].cpu_burst = rand() % 10 + 1; // Random burst time between 1 and 10 units
    }
}

int main() {
    int n;
    Process processes[MAX_PROCESS];

    printf("Enter the number of processes (up to %d): ", MAX_PROCESS);
    scanf("%d", &n);

    if (n <= 0 || n > MAX_PROCESS) {
        printf("Invalid number of processes. Please enter a value between 1 and %d.\n", MAX_PROCESS);
        return 1;
    }

    printf("Enter arrival time, CPU burst, and priority for each process:\n");
    for (int i = 0; i < n; i++) {
        processes[i].pid = i + 1;
        printf("Process %d: ", i + 1);
        scanf("%d %d %d", &processes[i].arrival_time, &processes[i].cpu_burst, &processes[i].priority);
    }

    generate_random_cpu_burst(processes, n);
    sort_by_priority(processes, n);
    calculate_waiting_time(processes, n);

    printf("\nGantt Chart:\n");
    for (int i = 0; i < n; i++) {
        printf("| P%d ", processes[i].pid);
    }
    printf("|\n");

    printf("\nProcess\tArrival Time\tBurst Time\tPriority\tTurnaround Time\tWaiting Time\n");
    for (int i = 0; i < n; i++) {
        printf("P%d\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", processes[i].pid, processes[i].arrival_time, processes[i].cpu_burst, processes[i].priority, processes[i].turnaround_time, processes[i].waiting_time);
    }

    calculate_turnaround_time(processes, n);

    return 0;
}
