{
	SACO Round 2 2008
	Solution to problem 3 - Checksums
	by Ben Steenhuisen
}
PROGRAM checksums;

var	account:string[255];
	x,y,error,checks:integer;
	second:boolean;

BEGIN
	second := false;
	write("Enter credit card number: ");
	read(account);
	for y:=1 to length(account) do
	begin
		val(account[y],x,error);
		if (second=true) then x := x*2; 
		if (x>9) 
		then begin checks := checks + (x div 10) + (x mod 10); end
		else begin checks := checks + x; end;
		second := not(second);
	end;
	write(checks);write(" ");
	if not((checks mod 10)=0) then write("IN");
	writeln("VALID");
END.
