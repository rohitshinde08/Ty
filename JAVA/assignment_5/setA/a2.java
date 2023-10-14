import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
    TextField t, t1;
    Label l, l1;
    int x, y;
    Panel p;

    MyFrame(String title) {
        super(title);
        setLayout(new FlowLayout());
        p = new Panel();
        p.setLayout(new GridLayout(2, 2, 5, 5));
        t = new TextField(20);
        l = new Label("Co-ordinates of clicking ");
        l1 = new Label("Co-ordinates of movement");
        t1 = new TextField(20);
        p.add(l);
        p.add(t);
        p.add(l1);
        p.add(t1);
        add(p);
        addWindowListener(new Mywindow());
        addMouseListener(new MyClick());
        addMouseMotionListener(new MyMove());
        setSize(500, 500);
    }

    class Mywindow extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            dispose();
        }
    }

    class MyClick extends MouseAdapter {
        public void mouseClicked(MouseEvent me) {
            x = me.getX();
            y = me.getY();
            t.setText("X=" + x + "Y=" + y);
        }
    }

    class MyMove extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent me) {
            x = me.getX();
            y = me.getY();
            t1.setText("X=" + x + "Y=" + y);
        }
    }

}

class Main {
    public static void main(String args[]) {
        MyFrame f = new MyFrame("Vanshika khairnar");
        f.setVisible(true);
    }
}