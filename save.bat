@echo off
color 1a
set /a version+=1
git add .
git commit -m "NEWSAVE %version%"
git push