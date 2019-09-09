// SACO Second Round 2009
// Problem: Robot Moves
// Authors: Alex Van Olst, Henk Joubert

program Robot;
{$APPTYPE CONSOLE}
uses SysUtils, Math;

var
  i, M, N, Top, Bottom, Left, Right, Moves : Integer;
  Initial : String;
begin
  WriteLn('Enter the width M:');
  ReadLn(M);
  WriteLn('Enter the height N:');
  ReadLn(N);
  WriteLn('Enter the initial instructions:');
  ReadLn(Initial);
  // The worst starting positions are on the sides
  // Simulate those 4 then take the best moves to a corner
  Top := 0;
  Bottom := N-1;
  Left := 0;
  Right := M-1;
  for i := 1 to Length(Initial) do
    begin
      if Initial[i] = 'd' then
        begin
          if Top < N-1 then Inc(Top);
          if Bottom < N-1 then Inc(Bottom);
        end;
      if Initial[i] = 'u' then
        begin
          if Top > 0 then Dec(Top);
          if Bottom > 0 then Dec(Bottom);
        end;
      if Initial[i] = 'r' then
        begin
          if Left < M-1 then Inc(Left);
          if Right < M-1 then Inc(Right);
        end;
      if Initial[i] = 'l' then
        begin
          if Left > 0 then Dec(Left);
          if Right > 0 then Dec(Ri);
        end;
    end;
  // From the worst starting positions is it the best to go up or down and left or right
  if top = bottom then bottom := 0; // If the worst possible is the same no vertical instructions are necessary
  if left = right then right := 0;  // If the worst possible is the same no horizontal instructions are necessary
  Moves := min(bottom ,N - top - 1) + min(right ,M - left - 1);
  WriteLn('You need to issue a further ' + IntToStr(Moves) + ' instructions.');
end.
