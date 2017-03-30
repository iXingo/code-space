@echo off
:start
set /a var+=1
echo a >> test.txtgit 
git add .
git commit --date=" April %var% 9:05:20 2017 +0800" -am "turns fucking green"
if %var% leq 30 GOTO start
git push origin master
@echo Mission finished !