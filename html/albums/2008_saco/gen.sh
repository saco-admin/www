#!/usr/bin/env sh
mkdir 'thumbs';
for i in *.jpg
do
    convert -resize 133x100 $i thumbs/$i
done;
