#!/bin/bash

diff <(cat reference_numbers.txt) <(java -cp ./build/libs/happynumbers-1.0.jar com.happynumbers.Main)
diff_result_code=$?

if [ $diff_result_code -eq 0 ]; then
  echo "SUCCESS: matches reference numbers"
else
  echo "FAILURE: mismatch as above"
fi
