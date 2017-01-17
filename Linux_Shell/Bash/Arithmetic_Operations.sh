#!/bin/bash
read exp
printf "%0.3f"  $(echo $exp | bc -l)
