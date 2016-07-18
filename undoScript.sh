#!/bin/bash


        if [[ $TRAVIS_TEST_RESULT -ne 0 ]] ; then
		echo 'test fails'
        fi

        echo $TRAVIS_TEST_RESULT
