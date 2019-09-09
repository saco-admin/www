// SACO Second Round 2009
// Problem: Bar Graph
// Author:  Michiel Baird

program bar_graph;

{$APPTYPE CONSOLE}

uses
  SysUtils;
var
  sInput  : string;
  value,i,j    : integer;
begin
  write('Enter the number: ');
  readln(sInput);
  for i := 1 to length(sInput) do
    begin
      write(sInput[i] + ' ');
      value := strtoint(sInput[i]);
      for j := 1 to value do
        write('*');
      writeln('');
    end;
end.
