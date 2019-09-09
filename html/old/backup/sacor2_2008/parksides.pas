{
	SACO Round 2 2008
	Solution to problem 4 - Parkside
	by Ben Steenhuisen
}
PROGRAM parksides;

var	x,y,N,S:integer;
	araz:array [1..100,1..100] of byte;

BEGIN
	write("Enter N: ");read(N);
	write("Enter S: ");read(S);
	for x:=1 to N do begin
		for y:=1 to x do begin
			araz[x][y]:=S;
			s := s+ 1;
			if (s=10) then s:=1;
		end;
	end;
	for x:=1 to N do begin
		for y:=1 to N do begin
			if not(araz[y][x]=0) then 
			begin
				write(araz[y][x]);
				write(" ");
			end 
			else begin
			write("  "); 
			end;
  		end;
		writeln("");
	end;
	
END.
