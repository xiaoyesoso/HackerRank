read N
read s
echo "$s" | tr " " "\n" | sort |uniq -u
