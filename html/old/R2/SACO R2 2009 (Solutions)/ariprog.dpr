// SACO Second Round 2009
// Problem: Arithmetic Progression
// Author:  Michiel Baird
program progression;

{$APPTYPE CONSOLE}

uses
  SysUtils;
var
  N,i,j,k                                   : Integer;
  best_len,best_delta,best_start,count      : Integer;
  cur_len,cur_delta,cur_pos               : Integer;
  bFound                                  : Boolean;
  numbers                                 : array of Integer;
begin
  write('Enter N: ');
  readln(N);
  setLength(numbers,N);
  for i := 0 to N-1 do
    begin
      write('Enter a number: ');
      readln(numbers[i]);
    end;
  best_len := 1;
  count := 0;
  for i := 0 to N-1 do
    for j := 0 to N-1 do
        if (numbers[i] - numbers[j]) > 0 then
          begin
               cur_delta := (numbers[i] - numbers[j]);
               cur_len := 2;
               cur_pos := numbers[i] + cur_delta;
               bFound := True;
               while bFound = true do
                  begin
                    bFound := False;
                    for k := 0 to N-1 do
                      begin
                        if cur_pos = numbers[k] then
                          begin
                            bFound := True;
                            break;
                          end;
                      end;
                    if bFound then
                    begin
                      inc(cur_pos,cur_delta);
                      inc(cur_len);
                    end;
                  end;
               if cur_len > best_len then
                begin
                    best_len := cur_len;
                    best_start := numbers[j];
                    best_delta := cur_delta;
                    count := 1;
                end
               else if cur_len = best_len then
                begin
                  inc(count);
                  if numbers[i] < best_start then
                    begin
                      best_start := numbers[j];
                      best_delta := cur_delta;
                    end
                  else if numbers[i] = best_start then
                    begin
                      if cur_delta < best_delta then
                         best_delta := cur_delta;
                    end;
                end;
          end;
  writeln('Arithmetic Progression Length = ' + inttostr(best_len));
  writeln('Number of Arithmetic Progressions = ' + inttostr(count));
  writeln('Arithmetic Progression First Term = ' + inttostr(best_start));
  writeln('Arithmetic Progression Common Difference = ' + inttostr(best_delta));
end.
