{
   Solution for 'Digit Sums'
   SACO Problem 3 - Junior
   and SACO Problem 1 - Senior
   Solution by Ben Steenhuisen
}
program digitsums;
uses crt;
var inp,x:integer;
    outstr:string;
procedure digit(a:integer);
var tst:string;
    value,sum,io:integer;
begin
    str(a,tst);
    sum:=0;
    for x:=1 to length(tst) do begin
       val(tst[x],value,io);
       sum:=sum+value;
    end;
    if (sum>9) then digit(sum) else
    begin
        str(sum,tst);
        outstr:=tst;
    end;
end;
begin
    clrscr;
    readln(inp);
    digit(inp);
    writeln(outstr);
end.
