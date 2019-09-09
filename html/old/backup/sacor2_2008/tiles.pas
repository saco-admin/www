{
	SACO Round 2 2008
	Solution to problem 6 - Tiles
	by Ben Steenhuisen
}
PROGRAM tiles;

var	tileto:array[1..2000000] of integer;
	x,N:integer;
BEGIN
	writeln("Enter N: ");read(N);
	tileto[1]:=0;tileto[2]:=1;tileto[3]:=1;
	for x:=4 to N do tileto[x]:=(tileto[x-3]+tileto[x-2]) mod 1007;
	writeln(tileto[N]);
END.
