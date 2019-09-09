// SACO Second Round 2009
// Problem: Unmarked Calculator Button
// Author: Michiel Baird

program unmarked_button;

{$APPTYPE CONSOLE}

uses
  SysUtils;
var
  a,b,c : integer;
begin
  write('First Number: ');
  readln(a);
  write('Second Number: ');
  readln(b);
  write('Answer: ');
  readln(c);
  if (a+b = c) then
    begin
      if (a*b = c) then
        writeln('Either Plus or Times')
      else
        writeln('Plus only');
    end
  else if (a*b = c) then
    writeln('Times Only')
  else
    writeln('Neither Plus nor Times');
  writeln(inttostr(a) + '+' +  inttostr(b) + '=' + inttostr(c));
  writeln(inttostr(a) + 'x' +  inttostr(b) + '=' + inttostr(c));
end. 
