:beginner: **git configuration**
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo
$ git config --global --list
user.name=CC2003User

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo
$ git config --global user.name CC2003User

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo
$ git config --global user.email "crafted.coded.2003@gmail.com"

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo
$ git config --global --list
user.name=CC2003User
user.email=crafted.coded.2003@gmail.com

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo
$ git config --global core.editor "code --wait"

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo
$ git config --global --list
user.name=CC2003User
user.email=crafted.coded.2003@gmail.com
core.editor=code --wait
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo
$ clear

```
:beginner: **create local repository**
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git init
Reinitialized existing Git repository in C:/Users/Enzo/Desktop/live_he/git/d1b-git-repo/.git/

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ ls -al
total 8
drwxr-xr-x 1 Enzo 197121 0 Oct 15 17:15 ./
drwxr-xr-x 1 Enzo 197121 0 Oct 15 16:54 ../
drwxr-xr-x 1 Enzo 197121 0 Oct 15 17:15 .git/

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ echo "mf1" > mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        mf1.txt

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git add mf1.txt
warning: LF will be replaced by CRLF in mf1.txt.
The file will have its original line endings in your working directory

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   mf1.txt

```
:beginner: **staging, and committing**
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git commit -m "add mf1.txt"
[master (root-commit) 46c539a] add mf1.txt
 1 file changed, 1 insertion(+)
 create mode 100644 mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git status
On branch master
nothing to commit, working tree clean

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git log
commit 46c539af5f9be22bfa314a60e98595245357b05e (HEAD -> master)
Author: CC2003User <crafted.coded.2003@gmail.com>
Date:   Thu Oct 15 17:18:21 2020 +0530

    add mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ code mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ cat >> mf1.txt
updated


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   mf1.txt

no changes added to commit (use "git add" and/or "git commit -a")

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git add .
warning: LF will be replaced by CRLF in mf1.txt.
The file will have its original line endings in your working directory

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   mf1.txt


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git commit -m "upd mf1.txt"
[master 670d8a1] upd mf1.txt
 1 file changed, 1 insertion(+)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git log
commit 670d8a105f23b161b595e2c208c1b2cdc8763f27 (HEAD -> master)
Author: CC2003User <crafted.coded.2003@gmail.com>
Date:   Thu Oct 15 17:25:17 2020 +0530

    upd mf1.txt

commit 46c539af5f9be22bfa314a60e98595245357b05e
Author: CC2003User <crafted.coded.2003@gmail.com>
Date:   Thu Oct 15 17:18:21 2020 +0530

    add mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git status
On branch master
nothing to commit, working tree clean

```
:label: ***git diff***  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git diff 46c539..670d8
diff --git a/mf1.txt b/mf1.txt
index 3af2016..98a8171 100644
--- a/mf1.txt
+++ b/mf1.txt
@@ -1 +1,2 @@
 mf1
+updated

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git diff HEAD~1..HEAD
diff --git a/mf1.txt b/mf1.txt
index 3af2016..98a8171 100644
--- a/mf1.txt
+++ b/mf1.txt
@@ -1 +1,2 @@
 mf1
+updated

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git diff HEAD~1
diff --git a/mf1.txt b/mf1.txt
index 3af2016..98a8171 100644
--- a/mf1.txt
+++ b/mf1.txt
@@ -1 +1,2 @@
 mf1
+updated

```
:label: ***adding updated files or all files***  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ touch mf2.txt mf3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        mf2.txt
        mf3.txt

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git add -u

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        mf2.txt
        mf3.txt

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git add -A

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   mf2.txt
        new file:   mf3.txt
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git commit -m "added mf2.txt mf3.txt"
[master d5e35a7] added mf2.txt mf3.txt
 2 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 mf2.txt
 create mode 100644 mf3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ ls
mf1.txt  mf2.txt  mf3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ rm mf3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    mf3.txt

no changes added to commit (use "git add" and/or "git commit -a")

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git add -u

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ mv mf2.txt mf2moved.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
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

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git add -A

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git commit -m "deleted mf3 and renamed mf2 to mf2moved"
[master 1727a12] deleted mf3 and renamed mf2 to mf2moved
 1 file changed, 0 insertions(+), 0 deletions(-)
 rename mf2.txt => mf2moved.txt (100%)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git log
commit 1727a120aa5c5fc3f721c61784cbad8d608a850b (HEAD -> master)
Author: CC2003User <crafted.coded.2003@gmail.com>
Date:   Thu Oct 15 17:39:19 2020 +0530

    deleted mf3 and renamed mf2 to mf2moved

commit 5731fc8dcee327ac70e959732b9230f9fd6c127b
Author: CC2003User <crafted.coded.2003@gmail.com>
Date:   Thu Oct 15 17:38:36 2020 +0530

    deleted mf3 and renamed mf2 to mf2moved

commit d5e35a7219c9df1e08b67ba8f438ac43e6dead94
Author: CC2003User <crafted.coded.2003@gmail.com>
Date:   Thu Oct 15 17:34:45 2020 +0530

    added mf2.txt mf3.txt

commit 670d8a105f23b161b595e2c208c1b2cdc8763f27
Author: CC2003User <crafted.coded.2003@gmail.com>
Date:   Thu Oct 15 17:25:17 2020 +0530

    upd mf1.txt

commit 46c539af5f9be22bfa314a60e98595245357b05e
Author: CC2003User <crafted.coded.2003@gmail.com>
Date:   Thu Oct 15 17:18:21 2020 +0530

    add mf1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ ls
mf1.txt  mf2moved.txt

```

:label: ***Working with Remote Repository*** 
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git remote add origin https://github.com/crafted-coded-2003/d1b-git-repo.git

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git remote -v
origin  https://github.com/crafted-coded-2003/d1b-git-repo.git (fetch)
origin  https://github.com/crafted-coded-2003/d1b-git-repo.git (push)

```
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git push origin master
Enumerating objects: 11, done.
Counting objects: 100% (11/11), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (11/11), 885 bytes | 885.00 KiB/s, done.
Total 11 (delta 1), reused 0 (delta 0)
remote: Resolving deltas: 100% (1/1), done.
To https://github.com/crafted-coded-2003/d1b-git-repo.git
 * [new branch]      master -> master

#error does not update
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git pull
remote: Enumerating objects: 4, done.
remote: Counting objects: 100% (4/4), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), done.
From https://github.com/crafted-coded-2003/d1b-git-repo
   5731fc8..4f9b94f  master     -> origin/master
There is no tracking information for the current branch.
Please specify which branch you want to merge with.
See git-pull(1) for details.

    git pull <remote> <branch>

If you wish to set tracking information for this branch you can do so with:

    git branch --set-upstream-to=origin/<branch> master

#works

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git pull origin master
From https://github.com/crafted-coded-2003/d1b-git-repo
 * branch            master     -> FETCH_HEAD
Updating 5731fc8..4f9b94f
Fast-forward
 ghmf1.txt | 1 +
 1 file changed, 1 insertion(+)
 create mode 100644 ghmf1.txt

```
:label: ***fetch and merge***  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git diff origin/master
diff --git a/ghmf1.txt b/ghmf1.txt
index b5af0bf..9ee559f 100644
--- a/ghmf1.txt
+++ b/ghmf1.txt
@@ -1,2 +1 @@
 add cc2003
-upd cc2003

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git merge
fatal: No remote for the current branch.

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git merge origin/master
Updating 4f9b94f..f915a19
Fast-forward
 ghmf1.txt | 1 +
 1 file changed, 1 insertion(+)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git log
commit f915a19f41616764027a08d8d1403b0b03902522 (HEAD -> master, origin/master)
Author: crafted-coded-2003 <70474214+crafted-coded-2003@users.noreply.github.com>
Date:   Thu Oct 15 18:26:46 2020 +0530

     upd through github

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git diff origin/master
diff --git a/conflict.txt b/conflict.txt
new file mode 100644
index 0000000..b14253e
--- /dev/null
+++ b/conflict.txt
@@ -0,0 +1 @@
+add from local

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git fetch
remote: Enumerating objects: 4, done.
remote: Counting objects: 100% (4/4), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), done.
From https://github.com/crafted-coded-2003/d1b-git-repo
   f915a19..6b30e93  master     -> origin/master


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master)
$ git diff origin/master
diff --git a/conflict.txt b/conflict.txt
index e4887be..b14253e 100644
--- a/conflict.txt
+++ b/conflict.txt
@@ -1 +1 @@
-add from github
+add from local

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo/.git (GIT_DIR!|MERGING)
$ code config

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo/.git (GIT_DIR!|MERGING)
$ git mergetool
fatal: C:/Program Files/Git/mingw64/libexec/git-core\git-mergetool cannot be used without a working tree.

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo/.git (GIT_DIR!|MERGING)
$ cd ..

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo (master|MERGING)
$ git mergetool
Merging:
conflict.txt

Normal merge conflict for 'conflict.txt':
  {local}: created file

```

:label: ***CC User accessing the repo of CC2003 User***  

```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo-cc/ed1a-git-repo (master)
$ cat >> ccusermf1.txt
add by (CCUser)


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo-cc/ed1a-git-repo (master)
$ git commit -am "add by ccuser"
warning: LF will be replaced by CRLF in ccusermf1.txt.
The file will have its original line endings in your working directory
[master 4d9c56e] add by ccuser
 1 file changed, 1 insertion(+)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo-cc/ed1a-git-repo (master)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo-cc/ed1a-git-repo (master)
$ git log
commit 4d9c56e44dc517ff9c15c53a0984f1802f421923 (HEAD -> master)
Author: CC2003User <crafted.coded.2003@gmail.com>
Date:   Thu Oct 15 19:05:13 2020 +0530

    add by ccuser

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1b-git-repo-cc/ed1a-git-repo (master)
$ git push
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 331 bytes | 331.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/crafted-coded-2003/ed1a-git-repo.git
   a37d152..4d9c56e  master -> master

```






