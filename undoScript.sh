#!/bin/bash


        if [[ $TRAVIS_TEST_RESULT -ne 0 ]] ; then
		echo '[x] Reseting the branch to last commit'
		git reset HEAD~1
        fi

        echo $TRAVIS_TEST_RESULT
