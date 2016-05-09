# goda5

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
