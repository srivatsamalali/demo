```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git
$ cd "C:\Users\Enzo\Desktop\live_he\git"

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git
$ mkdir d1a-git-repo

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git
$ cd d1a*

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo
$ ls

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo
$ ls -a
./  ../

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo
$ git init
Initialized empty Git repository in C:/Users/Enzo/Desktop/live_he/git/d1a-git-repo/.git/

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ ls -a
./  ../  .git/

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git status
On branch master

No commits yet

nothing to commit (create/copy files and use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ touch f1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        f1.txt

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ clear

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        f1.txt
        f2.txt

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git add f1.txt f2.txt
warning: LF will be replaced by CRLF in f2.txt.
The file will have its original line endings in your working directory

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   f1.txt
        new file:   f2.txt
```

```sh

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git add f1.txt f2.txt
warning: LF will be replaced by CRLF in f2.txt.
The file will have its original line endings in your working directory

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   f1.txt
        new file:   f2.txt

        Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git commit -m "Created f1.txt f2.txt"
[master (root-commit) 83edd21] Created f1.txt f2.txt
 2 files changed, 2 insertions(+)
 create mode 100644 f1.txt
 create mode 100644 f2.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git status
On branch master
nothing to commit, working tree clean

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git commit --help

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ dir
f1.txt  f2.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ touch f3.txt f4.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ dir
f1.txt  f2.txt  f3.txt  f4.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        f3.txt
        f4.txt

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git add f3.txt

```
```sh

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   f3.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        f4.txt


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git add f4.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   f3.txt
        new file:   f4.txt


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git commit f3.txt -m "added f3.txt"
[master 1ba95ba] added f3.txt
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 f3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   f4.txt
        
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git log
commit 1ba95ba29eedf63b08f94adfe7dfc1bba488fd58 (HEAD -> master)
Author: Dev1 <dev@company.com>
Date:   Thu Oct 8 15:18:14 2020 +0530

    added f3.txt

commit 83edd21540a142f8b50080f43975d3d03afd8256
Author: Dev1 <dev@company.com>
Date:   Thu Oct 8 15:10:34 2020 +0530

    Created f1.txt f2.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ git checkout  83edd21540a142f8b50080f43975d3d03afd8256
Note: switching to '83edd21540a142f8b50080f43975d3d03afd8256'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by switching back to a branch.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -c with the switch command. Example:

  git switch -c <new-branch-name>

Or undo this operation with:

  git switch -

Turn off this advice by setting config variable advice.detachedHead to false

HEAD is now at 83edd21 Created f1.txt f2.txt
A       f4.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo ((83edd21...))
$

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo ((83edd21...))
$ dir
f1.txt  f2.txt  f4.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo ((83edd21...))
$ git checkout master
Previous HEAD position was 83edd21 Created f1.txt f2.txt
Switched to branch 'master'
A       f4.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ dir
f1.txt  f2.txt  f3.txt  f4.txt
```



:beginner: **Unix commands**  

```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ rm f2.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ cat > f2.txt
This is f2.


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ cat f2.txt
This is f2.

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ cat > f2.txt
overwritten.


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ cat f2.txt
overwritten.

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ cat >> f2.txt
appended


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ cat f2.txt
overwritten.
appended


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ dir
f1.txt  f2.txt  f3.txt  f4.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ ls -l
total 1
-rw-r--r-- 1 Enzo 197121  0 Oct  8 14:27 f1.txt
-rw-r--r-- 1 Enzo 197121 22 Oct  8 14:57 f2.txt
-rw-r--r-- 1 Enzo 197121  0 Oct  8 15:37 f3.txt
-rw-r--r-- 1 Enzo 197121  0 Oct  8 15:16 f4.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ ls -a
./  ../  .git/  f1.txt  f2.txt  f3.txt  f4.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ ls -al
total 13
drwxr-xr-x 1 Enzo 197121  0 Oct  8 15:37 ./
drwxr-xr-x 1 Enzo 197121  0 Oct  8 14:26 ../
drwxr-xr-x 1 Enzo 197121  0 Oct  8 15:37 .git/
-rw-r--r-- 1 Enzo 197121  0 Oct  8 14:27 f1.txt
-rw-r--r-- 1 Enzo 197121 22 Oct  8 14:57 f2.txt
-rw-r--r-- 1 Enzo 197121  0 Oct  8 15:37 f3.txt
-rw-r--r-- 1 Enzo 197121  0 Oct  8 15:16 f4.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/live_he/git/d1a-git-repo (master)
$ ls
f1.txt  f2.txt  f3.txt  f4.txt

```



-----------------------------------------------
-----------------------------------------------