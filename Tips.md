 ## **Intellij**
|OS|Shortcut|Description|   |   |
|---|---|---|---|---|
|Mac|cmd + alt + B|  Jump from interface to implementing class in Java |   |   |
| Mac | cmd + ctrl + g  | Select all occurrences  |   |   |
| Mac  | cmd + alt + t  | Surround code fragments  |   |   |


 ## **VSC**
|OS|Shortcut|Description|   |   |
|---|---|---|---|---|
| Mac  | cmd + shift + L  | Select All Occurrences  |   |   |
| Mac  | shift + alt + down  | Duplicate lines down  |   |   |
| Mac  | alt + down  | Move lines down  |   |   |

## **Mac Hidden Files**
cmd + shift + .

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
## Tomcat
https://wolfpaulus.com/mac/tomcat/


## Setup intellij with correct jdk
``` xml
<properties>
  <maven.compiler.source>1.7</maven.compiler.source>
  <maven.compiler.target>1.7</maven.compiler.target>
</properties>
```
``` text
There are 3 places that need to be updated. (1) File -> Settings (Ctrl+alt+s for the shortcut) then "Build, Execution, Deployment">Compiler>Java Compiler and change the "Target bytecode version" to your desired Java version. (2 and 3) The other place is under File>Project Structure (Ctrl+Alt+Shift+S)> "Project Settings">"Project" change Project SDK to point to the appropriate version of Java and set the Project language level to the correct version. The code assist only changes the language level for you unfortunately making this an annoyance for new projects.
```
> Also need to rebuild project after updates

https://stackoverflow.com/questions/21006136/intellij-idea-13-uses-java-1-5-despite-setting-to-1-7


## Git submodule
https://gist.github.com/gitaarik/8735255

To update 
``` bash
git config --global alias.update '!git pull && git submodule update --init --recursive'

git update
```