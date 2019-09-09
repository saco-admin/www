{
        Solution for 'Dominoes', 
 	 SACO Question 4 Junior 2nd Round 2007
	 SACO Question 2 Senior 2nd Round 2007
	 By Ben Steenhuisen
}
program dominoes;
uses crt;
var NumDom,supers,x,y,KO,pointer,tempin:integer;
    araz: array[0..100] of integer;
    look: array[0..100] of boolean;
begin
    clrscr;
    readln(NumDom);
    for x:=0 to (NumDom-1) do begin
        readln(tempin);
        araz[x]:=tempin;
    end;
    for x:=0 to (NumDom-1) do
    begin
        for y:=0 to (NumDom-1) do look[y]:=False;
        pointer:=x;
        KO:= 0;
        while (look[pointer]=False) do
        begin
            inc(KO);
            look[pointer]:= True;
            pointer:= (pointer + araz[pointer]) mod NumDom;
        end;
        if (NumDom=KO) then inc(supers);
    end;
    writeln(supers);
end.
