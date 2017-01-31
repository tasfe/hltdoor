#!/bin/sh
echo 'update starting.....'

scp -r target/ROOT root@hltdoor.com:tomcat8/webapps/ROOT

