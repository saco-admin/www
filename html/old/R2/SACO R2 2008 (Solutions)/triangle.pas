{
	SACO Round 2 2008
	Solution to problem 1 - Triangles 
	by Ben Steenhuisen
}
PROGRAM triangle;

var 	x,N:integer;
	line:string;
BEGIN
	write("Enter N: ");
	readln(N);
	for x:=1 to N do 
	begin
		line := line + "* ";
		writeln(line);	
	end;
END.
