#!/bin/bash

mvn -Dtest=JunitTestSuite test 
rc=$?
if [[ $rc -ne 0 ]] ; then
	echo 'could not perform tests'; exit $rc
	#if test passes, merge it to master
	#switch to master first
       	
	#git checkout master
	#git merge testing
fi
