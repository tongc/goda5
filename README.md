
https://coderbyte.com/challenges

https://www.gotrip.hk/category/itineraryguide/japan_guide/kyoto_guide/page/6/

https://playcode.io/

https://www.eventbrite.com/d/united-kingdom--guildford/flatiron/?q=flatiron&mode=search&lc=1



git
~~~~
sync from original to forked branch
  git remote add upstream
  git fetch upstream
  git rebase upstream/master
show diff  
  git log -p 
revert a commit but keep local changes
  git reset --soft HEAD~1
revert a commit and remove local changes	
  git reset --hard HEAD~1b
sync up with the develop branch	
  git reset --hard origin/develop 
revert specific change list
  git revert $changelistid
  git push origin develop
delete all merged branches
  git branch --merged | grep -v * | xargs git branch -D  
delete untracked files, -fd to force clean
  git clean -d  or git clean -fd
change history commit message
  git rebase -i -p HEAD~1
  change pick to edit
  git commit --amend -m "New commit message" or git commit --amend
  git rebase --continue
  git push --force origin master
~~~~
dos
~~~~
create alias
  doskey gradlew gw $*
~~~~
linux
~~~~
  !n //goto command number n (from 'history') use !n:p if you don't want to execute the command straightaway
  lsof //find file handlers or a given file. file locked by process
  find . -name "08-14.log.gz" | xargs zgrep -E "pattern1|pattern2" //unzip and find pattern
  vmstat 1 //showing the system memory usage
~~~~

sublime
```javascript
[
{
"keys": ["ctrl+alt+s"], "command": "versioned"
},
{
"keys": ["ctrl+r"], "command": "show_panel", "args": {"panel": "replace", "reverse": false}
},
{
"keys": ["ctrl+t"], "command": "new_file"
},
{
"keys": ["ctrl+y"], "command": "run_macro_file", "args": {"file": "res://Packages/Default/Delete Line.sublime-macro"}
},
{ "keys": ["ctrl+w"], "command": "expand_region" },
{
"keys": ["ctrl+shift+w"],
"command": "expand_region",
"args": {"undo": true},
"context": [{ "key": "expand_region_soft_undo" }]
},
]
  
  
{
"font_size": 12,
"ignored_packages":
[
"Vintage"
],
"vintage_start_in_command_mode": true,
"save_on_focus_lost": true,
"word_wrap": false
}
```
