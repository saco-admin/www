{
  Solution for 'Triangles'
  SACO Problem 2
  2nd round 2007
  By Ben Steenhuisen
}
program triangle;
uses crt;
var x,y,z:integer;
begin
   clrscr;
   read(x);read(y);read(z);
   if ((x=y) and (x=z)) then
   begin
      writeln('EQUILATERAL');
   end
   else
   begin
      if ((x=y) or (x=z) or (y=z)) then writeln('ISOSCELES')
      else writeln('SCALENE');
   end;
end.
