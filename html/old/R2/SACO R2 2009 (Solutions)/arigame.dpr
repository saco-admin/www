// SACO Second Round 2009
// Problem: Arithmetic Game
// Author: Michiel Baird, Henk Joubert and Alex van Olst
program arigame;

{$APPTYPE CONSOLE}

uses
  SysUtils,System;

var
  NUMS        : array of integer;
  ans         : array of integer;
  k,l,temp    : Integer;
  cNum : Integer;
  cAns : Integer;
  count: Integer;
  SUM  : Integer;
  sInput : String;

  procedure solve(count : integer);
  var
    i,j,n,op   :     Integer;
    temp1,temp2:     Integer;
  begin
      for i := 0 to cNum -1 do
        if NUMS[i] <> -1 then
          for j := i+1 to cNum - 1 do
            if Nums[j]  <> -1 then
              for op := 0 to 1 do
                begin
                  if op = 0 then
                    n := nums[i] + nums[j]
                  else
                    n := nums[i] * nums[j];

                  if count = 2 then
                    begin
                      inc(cAns);
                      setLength(ans,cAns);
                      Ans[cAns-1] :=  n;
                    end
                  else
                    begin
                      temp1 := nums[j];
                      temp2 := nums[i];
                      nums[i] := n;
                      nums[j] := -1;
                      solve(count-1);
                      nums[j] := temp1;
                      nums[i] := temp2;
                    end;
                end;
  end;

begin
    write('What numbers do you have? ');
    readln(sInput);
    cNum := 0;
    cAns := 0;
    while (pos(' ',sInput) <> 0) do
      begin
          inc(cNum);
          setlength(NUMS,cNum);
          NUMS[cNum - 1] := strtoint(copy(sInput,0,pos(' ',sInput)-1));
          delete(sInput,1,pos(' ',sInput));
      end;
    inc(cNum);
    setlength(NUMS,cNum);
    NUMS[cNum - 1] := strtoint(sInput);
    solve(cNum);
    for k := 0 to cAns-2 do
      for l := k to cAns-1 do
        if ans[k] > ans[l] then
          begin
            temp := ans[k];
            ans[k] := ans[l];
            ans[l] := temp;
          end;
    count := 0;
    sum := 0;
    temp := 0;
    for k := 0 to cAns-1 do
      if ans[k] <> temp then
        begin
          temp := ans[k];
          inc(count);
          inc(sum,ans[k]);
        end;
    writeln('You can form ' + inttostr(count) + ' numbers');
    writeln('Their sum is ' + inttostr(sum));
    readln(count);
end. 
