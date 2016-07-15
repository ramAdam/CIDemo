#!/bin/bash

mvn clean -Dtest=JunitTestSuite test 
rc=$?
if [[ $rc -ne 0 ]] ; then
	echo 'could not perform tests'; exit $rc

else
	#if test passes, merge it to master
	#switch to master first
	echo '[*] Staging files'
	git add --all
	echo '[*] commiting ....'
	git commit
       	git checkout master
	git merge testing
	exit 0
fi
