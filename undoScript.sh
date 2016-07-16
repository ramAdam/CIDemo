#!/bin/bash

rc=$?
        if [[ $rc -ne 0 ]] ; then
          echo 'could not perform tests'; exit $rc
        fi

        echo 'testing hell script' 
