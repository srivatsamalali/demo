:beginner: **Git Configuration**  
:label: ***setting up***  
:beginner: **Git Repository**  
:label: ***create local repo, add file, commit, view log***  
:label: ***update & commit working area, staged, local repo***  
:label: ***git diff***  
:label: ***adding updated files or all files***  
:label: ***delete & move***  
:label: ***undoing changes in working copy***  
:label: ***undoing changes in repository***  
:beginner: **clean the working copy**   
:beginner: **ignoring files (gitignore)**  

-------------------------

:beginner: **Git Configuration**  
:label: ***setting up***  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop
$ pwd
/c/Users/Enzo/Desktop

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop
$ mkdir d1a-git

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop
$ cd d1a-git

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/d1a-git
$ git init
Initialized empty Git repository in C:/Users/Enzo/Desktop/d1a-

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/d1a-git (master)
$ dir

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/d1a-git (master)
$ ls -a
./  ../  .git/

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/d1a-git (master)
$ cat .gitconfig
cat: .gitconfig: No such file or directory

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/d1a-git (master)
$ cd ~

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ pwd
/c/Users/Enzo

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ cat .gitconfig
[user]
        name = Crafted Coded User
        email = crafted.coded@gmail.com
[core]
        editor = code --wait

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ rm .gitconfig

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ ls .gitconfig
ls: cannot access '.gitconfig': No such file or directory
```
:label: ***configure git***  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ touch .gitconfig

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ cat .gitconfig

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ git config --global --list

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ git config --global user.name "Crafted Code User"

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ git config --global user.email "crafted.coded@gmail.com"

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ git config --global --list
user.name=Crafted Code User
user.email=crafted.coded@gmail.com

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ cat ~/.gitconfig
[user]
        name = Crafted Code User
        email = crafted.coded@gmail.com

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ git config --global core.editor "code --wait"

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ git config --global --list
user.name=Crafted Code User
user.email=crafted.coded@gmail.com
core.editor=code --wait

Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ cat ~/.gitconfig
[user]
        name = Crafted Code User
        email = crafted.coded@gmail.com
[core]
        editor = code --wait

```
:beginner: **Git Repository**  

:label: ***create local repo, add file, commit, view log***  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~
$ cd ~/desktop/d1a-git

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ echo "mf1" > mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ cat mf1.txt
mf1

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        mf1.txt

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git add mf1.txt
warning: LF will be replaced by CRLF in mf1.txt.
The file will have its original line endings in your working directory

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git commit -m "add mf1.txt"
[master (root-commit) 9b6d347] add mf1.txt
 1 file changed, 1 insertion(+)
 create mode 100644 mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git log
commit 9b6d347f13d3fcb3cf6247c900a3d1de2b0be7a2 (HEAD -> master)
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:33:23 2020 +0530

    add mf1.txt
```
:label: ***update & commit working area, staged, local repo***  

```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ code mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   mf1.txt

no changes added to commit (use "git add" and/or "git commit -a")

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git add .
warning: LF will be replaced by CRLF in mf1.txt.
The file will have its original line endings in your working directory

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git commit
[master 35e4e51] upd mf1.txt
 1 file changed, 1 insertion(+)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
nothing to commit, working tree clean

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git log
commit 35e4e5151c5aec092f4cf87e98075bfe6f1d371c (HEAD -> master)
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:45:15 2020 +0530

    upd mf1.txt

commit 9b6d347f13d3fcb3cf6247c900a3d1de2b0be7a2
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:33:23 2020 +0530

    add mf1.txt
:label: ***git diff***  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git log
commit 35e4e5151c5aec092f4cf87e98075bfe6f1d371c (HEAD -> master)
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:45:15 2020 +0530

    upd mf1.txt

commit 9b6d347f13d3fcb3cf6247c900a3d1de2b0be7a2
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:33:23 2020 +0530

    add mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git diff  9b6d347f13d3fcb3cf6247c900a3d1de2b0be7a2..35e4e5151c5aec092f4cf87e98075bfe6f1d371c
diff --git a/mf1.txt b/mf1.txt
index 3af2016..bd63284 100644
--- a/mf1.txt
+++ b/mf1.txt
@@ -1 +1,2 @@
 mf1
+updated
\ No newline at end of file

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git diff 9b6d3..35e4e
diff --git a/mf1.txt b/mf1.txt
index 3af2016..bd63284 100644
--- a/mf1.txt
+++ b/mf1.txt
@@ -1 +1,2 @@
 mf1
+updated
\ No newline at end of file

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git diff 9b6d3 .. 35e4e
fatal: 35e4e: no such path in the working tree.
Use 'git <command> -- <path>...' to specify paths that do not exist locally.

```

:label: ***adding updated files or all files***  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ touch mf2.txt mf3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        mf2.txt
        mf3.txt

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git add -u

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        mf2.txt
        mf3.txt

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git add -A

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   mf2.txt
        new file:   mf3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git commit -m "add mf2.txt mf3.txt
> "
[master e048b24] add mf2.txt mf3.txt
 2 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 mf2.txt
 create mode 100644 mf3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git log
commit e048b244b2780c19c861f28e8addecc14600cf76 (HEAD -> master)
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 12:04:23 2020 +0530

    add mf2.txt mf3.txt

commit 35e4e5151c5aec092f4cf87e98075bfe6f1d371c
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:45:15 2020 +0530

    upd mf1.txt

commit 9b6d347f13d3fcb3cf6247c900a3d1de2b0be7a2
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:33:23 2020 +0530

    add mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git diff HEAD~1
diff --git a/mf2.txt b/mf2.txt
new file mode 100644
index 0000000..e69de29
diff --git a/mf3.txt b/mf3.txt
new file mode 100644
index 0000000..e69de29

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git log
commit e048b244b2780c19c861f28e8addecc14600cf76 (HEAD -> master)
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 12:04:23 2020 +0530

    add mf2.txt mf3.txt

commit 35e4e5151c5aec092f4cf87e98075bfe6f1d371c
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:45:15 2020 +0530

    upd mf1.txt

commit 9b6d347f13d3fcb3cf6247c900a3d1de2b0be7a2
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:33:23 2020 +0530

    add mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git diff HEAD~2
diff --git a/mf1.txt b/mf1.txt
index 3af2016..bd63284 100644
--- a/mf1.txt
+++ b/mf1.txt
@@ -1 +1,2 @@
 mf1
+updated
\ No newline at end of file
diff --git a/mf2.txt b/mf2.txt
new file mode 100644
index 0000000..e69de29
diff --git a/mf3.txt b/mf3.txt
new file mode 100644
index 0000000..e69de29

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git diff HEAD~3
fatal: ambiguous argument 'HEAD~3': unknown revision or path not in the working tree.
Use '--' to separate paths from revisions, like this:
'git <command> [<revision>...] -- [<file>...]'

```
:eye: * dash u (-u) option only adds updated files, files that have changed Git knows about. These could be either changes to files or it could also be deletions of files*  
:eye: *Capital A adds all files including untracked ones.*  

:label: ***delete & move***  
```sh
$ ls
mf1.txt  mf2.txt  mf3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ rm mf3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    mf3.txt

no changes added to commit (use "git add" and/or "git commit -a")

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git add -u

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        deleted:    mf3.txt


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ mv mf2.txt mf2moved.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        deleted:    mf3.txt

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    mf2.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        mf2moved.txt


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git add -A

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        renamed:    mf2.txt -> mf2moved.txt
        deleted:    mf3.txt
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git commit -m "del f3 & renamed mf2 to mf2moved"
[master 7e1e04f] del f3 & renamed mf2 to mf2moved
 2 files changed, 0 insertions(+), 0 deletions(-)
 rename mf2.txt => mf2moved.txt (100%)
 delete mode 100644 mf3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
nothing to commit, working tree clean

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git log
commit 7e1e04f57ef234148b5f6979094f0d9a182ac30e (HEAD -> master)
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 12:20:39 2020 +0530

    del f3 & renamed mf2 to mf2moved

commit e048b244b2780c19c861f28e8addecc14600cf76
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 12:04:23 2020 +0530

    add mf2.txt mf3.txt

commit 35e4e5151c5aec092f4cf87e98075bfe6f1d371c
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:45:15 2020 +0530

    upd mf1.txt

commit 9b6d347f13d3fcb3cf6247c900a3d1de2b0be7a2
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:33:23 2020 +0530

    add mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ ls
mf1.txt  mf2moved.txt

```
:label: ***undoing changes in working copy***  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ cat mf1.txt
mf1
updated
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ cat >> mf1.txt
upated 1

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ cat mf1.txt
mf1
updatedupated 1

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git checkout mf1.txt
Updated 1 path from the index

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
nothing to commit, working tree clean


```

:label: ***undoing changes in repository***  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ ls
mf1.txt  mf2moved.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ cat mf1.txt
mf1
updated
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ cat >> mf1.txt
update1


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ rm mf2moved.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   mf1.txt
        deleted:    mf2moved.txt

no changes added to commit (use "git add" and/or "git commit -a")

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git add .
warning: LF will be replaced by CRLF in mf1.txt.
The file will have its original line endings in your working directory

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   mf1.txt
        deleted:    mf2moved.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   mf1.txt
        deleted:    mf2moved.txt


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git reset --hard
HEAD is now at 7e1e04f del f3 & renamed mf2 to mf2moved

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
nothing to commit, working tree clean

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ dir
mf1.txt  mf2moved.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ cat mf1.txt
mf1
updated

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git log
commit 7e1e04f57ef234148b5f6979094f0d9a182ac30e (HEAD -> master)
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 12:20:39 2020 +0530

    del f3 & renamed mf2 to mf2moved

commit e048b244b2780c19c861f28e8addecc14600cf76
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 12:04:23 2020 +0530

    add mf2.txt mf3.txt

commit 35e4e5151c5aec092f4cf87e98075bfe6f1d371c
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:45:15 2020 +0530

    upd mf1.txt

commit 9b6d347f13d3fcb3cf6247c900a3d1de2b0be7a2
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:33:23 2020 +0530

    add mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git reset --soft HEAD~1

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git log
commit e048b244b2780c19c861f28e8addecc14600cf76 (HEAD -> master)
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 12:04:23 2020 +0530

    add mf2.txt mf3.txt

commit 35e4e5151c5aec092f4cf87e98075bfe6f1d371c
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:45:15 2020 +0530

    upd mf1.txt

commit 9b6d347f13d3fcb3cf6247c900a3d1de2b0be7a2
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:33:23 2020 +0530

    add mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        renamed:    mf2.txt -> mf2moved.txt
        deleted:    mf3.txt


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ touch mf4.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        renamed:    mf2.txt -> mf2moved.txt
        deleted:    mf3.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        mf4.txt


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git add -A

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        renamed:    mf2.txt -> mf2moved.txt
        renamed:    mf3.txt -> mf4.txt


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git commit -m "add mf4.txt after git reset -soft HEAD~1"
[master 1e1ec52] add mf4.txt after git reset -soft HEAD~1
 2 files changed, 0 insertions(+), 0 deletions(-)
 rename mf2.txt => mf2moved.txt (100%)
 rename mf3.txt => mf4.txt (100%)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
nothing to commit, working tree clean

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git log
commit 1e1ec5230bfd5f518045a99613cba4ae4c368552 (HEAD -> master)
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 12:44:27 2020 +0530

    add mf4.txt after git reset -soft HEAD~1

commit e048b244b2780c19c861f28e8addecc14600cf76
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 12:04:23 2020 +0530

    add mf2.txt mf3.txt

commit 35e4e5151c5aec092f4cf87e98075bfe6f1d371c
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:45:15 2020 +0530

    upd mf1.txt

commit 9b6d347f13d3fcb3cf6247c900a3d1de2b0be7a2
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:33:23 2020 +0530

    add mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git reset --hard HEAD~1
HEAD is now at e048b24 add mf2.txt mf3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
nothing to commit, working tree clean

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git log
commit e048b244b2780c19c861f28e8addecc14600cf76 (HEAD -> master)
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 12:04:23 2020 +0530

    add mf2.txt mf3.txt

commit 35e4e5151c5aec092f4cf87e98075bfe6f1d371c
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:45:15 2020 +0530

    upd mf1.txt

commit 9b6d347f13d3fcb3cf6247c900a3d1de2b0be7a2
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:33:23 2020 +0530

    add mf1.txt
```

:beginner: **clean the working copy**
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ touch temp1 temp2

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        temp1
        temp2

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git clean
fatal: clean.requireForce defaults to true and neither -i, -n, nor -f given; refusing to clean

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git clean -n
Would remove temp1
Would remove temp2

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git clean -f
Removing temp1
Removing temp2

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
nothing to commit, working tree clean

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ ls
mf1.txt  mf2.txt  mf3.txt

```

:beginner: **ignoring files (gitignore)**  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ mkdir logs

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ touch logs/ml1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        logs/

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ code .gitignore

add "logs/" inside the file .gitignore in vscode

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ cat .gitignore
logs/
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git add .gitignore

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   .gitignore


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git commit -m "add .gitignore"
[master ee0640f] add .gitignore
 1 file changed, 1 insertion(+)
 create mode 100644 .gitignore

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git status
On branch master
nothing to commit, working tree clean

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/d1a-git (master)
$ git log
commit ee0640f9739a403a76e31c25a86267b7773f7bd6 (HEAD -> master)
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 13:04:00 2020 +0530

    add .gitignore

commit e048b244b2780c19c861f28e8addecc14600cf76
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 12:04:23 2020 +0530

    add mf2.txt mf3.txt

commit 35e4e5151c5aec092f4cf87e98075bfe6f1d371c
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:45:15 2020 +0530

    upd mf1.txt

commit 9b6d347f13d3fcb3cf6247c900a3d1de2b0be7a2
Author: Crafted Code User <crafted.coded@gmail.com>
Date:   Mon Oct 12 11:33:23 2020 +0530

    add mf1.txt


```
