filename="ciao.txt"

if [ -f "$filename" ]; then
  echo "file $filename processing.."
else
  echo "Error $filename not found"
  exit 1
fi