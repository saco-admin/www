{Pascal solution By Ben Steenhuisen}
program tee;
uses crt;
var len,x,y:integer;
begin
       clrscr;
       readln(len);
       for x:=1 to len do begin
               write('t');
       end;
       writeln();
       for x:=1 to (len-1) do begin
               for y:=1 to ((len-1) div 2) do write(' ');
               writeln('t');
       end;
end.
