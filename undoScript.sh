#!/bin/bash


        if [[ $TRAVIS_TEST_RESULT -ne 0 ]] ; then
          echo 'could not perform tests'; exit $rc
        fi

        echo $TRAVIS_TEST_RESULT
