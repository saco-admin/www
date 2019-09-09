{
	SACO Round 2 2008
	Solution to problem 5 - Palindromes
	by Ben Steenhuisen
}
PROGRAM palindrome;

var	x,y,iters,eCode:longint;
	N,tempS:string[255];
	flag:boolean;


BEGIN
	flag:=true;
	write("Enter starting N: "); read(N);
	while (flag) do 
	begin
		tempS:="";
		for x:=length(N) downto 1 do 
		begin
			tempS := tempS + N[x];
		end;
		if (tempS=N) then 
		begin 
			flag := false;
		end
		else begin 
			iters := iters + 1;
			if iters=100 then flag:=false;
			val(n,y,eCode);
			val(tempS,x,eCode);
			str((x+y),N);
	 	end;
	end;
	if not(iters=100) then writeln(iters," ",N) else writeln("DOES NOT TERMINATE");
END.
