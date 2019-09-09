#!/usr/bin/perl -w
use CGI::Pretty qw(:standard);

print start_html('SACO 2008 Pictures');
print h1('SACO 2008');
foreach (@ARGV)
{
    print a({-href => $_}, img({-src => "thumbs/$_"}));
}
print end_html();
