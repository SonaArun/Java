declare -i cnt=$(($1))
echo "Enter starting value :"
read n
echo "Count down starts:"
for ((i=n; i>0 ;i--)); do
printf "%2s\n" "$i"
sleep .5
done
printf "\nfinish"
exit 0
