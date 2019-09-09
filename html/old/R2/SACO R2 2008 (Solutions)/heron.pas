{
	SACO Round 2 200 8
	Solution to problem 2 - Heron's 
	by Ben Steenhuisen
} 
PROGRAM heron;

var 	a,b,c:integer;
	s,area:real;

BEGIN
	write("Enter a: ");
	read(a);
	write("Enter b: ");
	read(b);
	write("Enter c: ");
	read(c);
	s := (a+b+c+0.0)/(2.0);
	writeln(sqrt(s*(s-a)*(s-b)*(s-c)):5:9);
END.
