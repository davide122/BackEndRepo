@echo off
color 0a
set /a version+=1
git add .
git commit -m "NEWSAVE %version%"
git push