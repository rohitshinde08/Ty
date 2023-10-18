21 23 24 
<?php
if (isset($_POST['submit'])) {
    $sentence = $_POST['sentence'];
    $word = $_POST['word'];
    $position = $_POST['position'];
    $num_chars = $_POST['num_chars'];

    // Task a: Delete a small part from the sentence
    $modifiedSentenceA = substr_replace($sentence, '', $position, $num_chars);

    // Task b: Insert the word in the sentence at a specified position
    $modifiedSentenceB = substr_replace($sentence, $word, $position, 0);

    // Task c: Replace some characters in the sentence with the word at a specified position
    $modifiedSentenceC = substr_replace($sentence, $word, $position, $num_chars);

    // Task d: Replace all characters in the sentence with the word after a specified position
    $modifiedSentenceD = substr_replace($sentence, $word, $position);

    echo "<h3>Modified Sentence (Task a): $modifiedSentenceA</h3>";
    echo "<h3>Modified Sentence (Task b): $modifiedSentenceB</h3>";
    echo "<h3>Modified Sentence (Task c): $modifiedSentenceC</h3>";
    echo "<h3>Modified Sentence (Task d): $modifiedSentenceD</h3>";
}
?>