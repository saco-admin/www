#!/usr/bin/env sh
for i in *.JPG
do
    convert -resize 133x100 $i thumbs/$i
done;
