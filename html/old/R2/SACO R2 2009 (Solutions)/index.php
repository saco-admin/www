<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
"http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <title>South Africa Computer Olympiad Second Round Solutions 2009</title>
    </head>
    <body>
<?php
require_once('../../../geshi/geshi.php');
function display($filename, $language) {
    $source = implode('', file($filename));
    $geshi =& new GeSHi($source, $language);
    $geshi->enable_line_numbers(GESHI_NORMAL_LINE_NUMBERS);
    print $geshi->parse_code();
    print "<p><a href='$filename'>Download</a></p>\n";
}
?>
        <h1>SACO Second Round Solutions 2009</h1>

        <ol>
            <li><a href="#q1">Unmarked Calculator Button</a></li>
            <li><a href="#q2">Bar Graph</a></li>
            <li><a href="#q3">Arithmetic Progression</a></li>
            <li><a href="#q4">Robot Moves</a></li>
            <li><a href="#q5">Arithmetic Game</a></li>
        </ol>

        <h2><a name="q1">Unmarked Calculator Button</a></h2>
        <h3>Python</h3>
        <?php display('button.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('button.java', 'java'); ?>
        <h3>Delphi</h3>
        <?php display('button.dpr', 'delphi'); ?>

        <h2><a name="q2">Bar Graph</a></h2>
        <h3>Python</h3>
        <?php display('bargraph.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('bargraph.java', 'java'); ?>
        <h3>Delphi</h3>
        <?php display('bargraph.dpr', 'delphi'); ?>

        <h2><a name="q3">Arithmetic Progression</a></h2>
        <h3>Solution</h3>
        <p><i>Author: Julian Kenwood</i>
</p>The constraints for the problem were very low, so there are many possible
solutions for the problem. The solution used in the presented code is not the
fastest, but will work for all the testcases.
</p>
<p>To find the solution we will need to find all the increasing arithmetic
progressions. After reading in the numbers, we do a nested loop over each pair
of numbers in the list. The first number is the first term(a) of the arithmetic
progression and the difference between the two numbers will be the common
difference(d) of the current arithmetic progression. If d is not positive we
know we are looking at an arithmetic progression that is not increasing and we
can skip it.
</p>
<p>These two numbers, a and d, define the entire arithmetic progression. All we
need to do is to find the length of the arithmetic progression that we can make
from the numbers we read in. That is we need to find how many of the numbers {a,
a+d, a+2d, a+3d, ...} we have. We can do this by just performing searches in
order for a+2d, a+3d, a+4d and so on, stopping when we do not find what we are
looking for.
</p>
<p>This will tell us what the longest increasing arithmetic progression we can
make with a and d. Doing this for all pairs of numbers, we can work out how many
arithmetic progressions exist with this length. If we find an arithmetic
sequence of length less than our current maximum, we ignore it. If they are of
equal length, we can increment a counter to represent how many longest
arithmetic progressions there are. If we find a longer arithmetic progression,
we update the longest length variable and reset the number of longest arithmetic
progressions to 1. To find the arithmetic progression first term and common
difference that we must output, we must keep two variables that record them.
Every time we find an arithmetic sequence of greater length we reset these
variables to the a and d that we are currently looking at. If they are of equal
length, we set these variables to the a and d, only if we are looking at an
arithmetic progression with a smaller a.
</p>
        <h3>Python</h3>
        <?php display('ariprog.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('ariprog.java', 'java'); ?>
        <h3>Delphi</h3>
        <?php display('ariprog.dpr', 'delphi'); ?>

        <h2><a name="q4">Robot Moves</a></h2>
        <h3>Solution</h3>
<p><i>Author: Michiel Baird</i>
</p>
<p>The first thing we need to realise when looking at this problem is that the
vertical and horizontal dimensions can be handled independently of each
other. We then only need to simulate the 2 worst starting positions in each
dimension.
</p>
<p>Looking at the horizontal dimension:
</p>
<p>We indicate two starting positions: the leftmost and the rightmost point. We
then read in the instructions moving those two positions accordingly and ignore
instructions that results in crossing over a boundary.  If the indexes are the
same after we simulated the movement, we are already at a known position
and we don't need any further instructions.
</p>
<p>If they are not the same, we take either the number of instructions needed
to move the point that started to the left and move it to the right boundary,
or the point that started to the right and move it to the left boundary. We
choose the minimum of these two.
</p>
<p>We follow this process for the vertical dimension as well.  The final answer
is just the sum of the instructions needed for both dimensions.
</p>
        <h3>Python</h3>
        <?php display('robotmoves.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('robotmoves.java', 'java'); ?>
        <h3>Delphi</h3>
        <?php display('robotmoves.dpr', 'delphi'); ?>

        <h2><a name="q5">Arithmetic Game</a></h2>
        <h3>Solution</h3>
<p><i>Author: Max Rabkin</i>
</p>
<p>Each possible answer is either a sum or a product. Sum or product of
what? Well, a possible answer for a smaller set of numbers. So we
recursively look for answers formed by subsets of the given set, and
the possible answers for the complement of the subset (the complement
of a subset with respect to a set is the set of elements that are in
the original set but not in the subset), and give the product or sum
of the corresponding answers.
</p>
<p>At the end, we simply discard all the duplicated answers, count them
and find their sum.
</p>
        <h3>Python</h3>
        <?php display('arigame.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('arigame.java', 'java'); ?>
        <h3>Delphi</h3>
        <?php display('arigame.dpr', 'delphi'); ?>

    </body>
</html>
