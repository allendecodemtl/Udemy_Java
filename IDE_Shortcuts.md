 ## **Intellij**
|OS|Shortcut|Description|   |   |
|---|---|---|---|---|
|Mac|cmd + alt + B|  Jump from interface to implementing class in Java |   |   |
| Mac | cmd + ctrl + g  | Select all occurrences  |   |   |
|   |   |   |   |   |


 ## **VSC**
|OS|Shortcut|Description|   |   |
|---|---|---|---|---|
| Mac  | cmd + shift + L  | Select All Occurrences  |   |   |
| Mac  | shift + alt + down  | Duplicate lines down  |   |   |
| Mac  | alt + down  | Move lines down  |   |   |


 ## **Intellij config for test**
Hit al-enter on class and chose "Create Test" to generate test file
Hit alt-enter and choose Add junit.jar to the classpath if cannot locate path

In Test.java class right click outside method but inside class press "Create TestClasName" to that we have the test run config

## **Untrack files already added to git repository based on .gitignore**
> 1. Commit all you changes
> 2. Remove everything from the repository
``` bash
git rm -r --cached .
```
> 3. Re add everything
``` bash
git add .
```
> 4. Commit
``` bash
git commit -m ".gitignore fix"
```
http://www.codeblocq.com/2016/01/Untrack-files-already-added-to-git-repository-based-on-gitignore/

## **How to manage multiple GitHub accounts on a single machine with SSH keys**
``` bash
git clone git@github.com-work_user1:work_user1/repo_name.gi .
```
https://medium.freecodecamp.org/manage-multiple-github-accounts-the-ssh-way-2dadc30ccaca
https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/

## Others
``` bash
find . -name '*.zip' -exec sh -c 'unzip -d "${1%.*}" "$1"' _ {} \;
find . -name '*.zip' -exec sh -c 'rm "$1"' _ {} \;
```

