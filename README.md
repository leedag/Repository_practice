소프트웨어 공학 미션2
이름: C082039 정예빈, C082027 이다건
역할: 정예빈 - bs코드 작성, 테스트코드 작성/이다건 – Jenkins CI/CD 구동, 아웃풋 로그 저장

#git log
#정예빈 commit
commit 82b94fdbe8fe40d821db49399ad34f5978768171 (HEAD -> master, origin/master)
Author: Jbeeny <dpqls8371@naver.com>
Date:   Mon Jun 17 16:18:56 2024 +0900

    add bsSearch

commit 24d3f659267dc821420f8034597579f39c5fa641
Merge: b5e33e7 db53795
Author: Jbeeny <dpqls8371@naver.com>
Date:   Mon Jun 17 16:15:31 2024 +0900

    Merge branch 'master' of https://github.com/Jbeeny/Practice

commit b5e33e76178de1caab633d4ac5b4de7911321961
Author: Jbeeny <dpqls8371@naver.com>
Date:   Mon May 27 22:49:47 2024 +0900

    for test

commit 8567117d0f779ceee57c3d5ba8704c73048a2340
Author: Jbeeny <dpqls8371@naver.com>
Date:   Mon May 27 22:47:45 2024 +0900

    try jenkins codes

commit db5379596b5c610e68be7b43b6756c3b500640f9
Merge: 19c5596 654446a
Author: Jbeeny <dpqls8371@naver.com>
Date:   Fri May 24 17:50:53 2024 +0900
:

#이다건 commit

commit 19aaa062749ee90f0043e28fd800f4482743a371 (HEAD -> master, origin/master)
Merge: 895f764 113c552
Author: leedag <dlekrjs01231@gmail.com>
Date:   Mon Jun 17 19:04:04 2024 +0900

    Merge branch 'master' of https://github.com/leedag/Repository_practice

commit 895f764a6aea4d6bf8bb8bd8fed2a1826afede03
Author: leedag <dlekrjs01231@gmail.com>
Date:   Mon Jun 17 18:59:23 2024 +0900

    Initial commit

commit 113c552da4a556c16ed9ea5928c4786e1b57c0fc
Merge: a78b2b7 c3755b7
Author: leedag <155880368+leedag@users.noreply.github.com>
Date:   Tue May 28 16:56:25 2024 +0900

    Merge pull request #2 from leedag/new1

    add jenkinsfile

commit c3755b7e197fcc8f51ad41cec8832235b22d9ca2 (origin/new1)
Author: leedag <dlekrjs01231@gmail.com>
Date:   Tue May 28 16:54:21 2024 +0900

    add jenkinsfile

commit a78b2b7d4e2e07e8a747de2fdc18d2a17580a715
Merge: 2f9a751 5f6e8fc
Author: leedag <155880368+leedag@users.noreply.github.com>
Date:   Tue May 28 16:29:36 2024 +0900

    Merge pull request #1 from leedag/new1

    push test

commit 5f6e8fcc4007254b7591d5352ad087ba68a588cb
Author: leedag <dlekrjs01231@gmail.com>
Date:   Tue May 28 16:25:59 2024 +0900

    push test

commit 2f9a751d621f3f2e15714f845a6eb35dd7777202
Author: leedag <dlekrjs01231@gmail.com>
Date:   Mon May 27 02:10:03 2024 +0900

    first commit
Github 주소: https://github.com/leedag/Repository_practice

#Jenkins Outputlog

Started by user Lee Da Geon
Obtained BookManager/Jenkinsfile from git https://github.com/leedag/Repository_practice.git
[Pipeline] Start of Pipeline
[Pipeline] node
Running on Jenkins in C:\ProgramData\Jenkins\.jenkins\workspace\HONGIK
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Declarative: Checkout SCM)
[Pipeline] checkout
Selected Git installation does not exist. Using Default
The recommended git tool is: NONE
using credential hongik-test
 > git.exe rev-parse --resolve-git-dir C:\ProgramData\Jenkins\.jenkins\workspace\HONGIK\.git # timeout=10
Fetching changes from the remote Git repository
 > git.exe config remote.origin.url https://github.com/leedag/Repository_practice.git # timeout=10
Fetching upstream changes from https://github.com/leedag/Repository_practice.git
 > git.exe --version # timeout=10
 > git --version # 'git version 2.43.0.windows.1'
using GIT_ASKPASS to set credentials 
 > git.exe fetch --tags --force --progress -- https://github.com/leedag/Repository_practice.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git.exe rev-parse "refs/remotes/origin/master^{commit}" # timeout=10
Checking out Revision 19aaa062749ee90f0043e28fd800f4482743a371 (refs/remotes/origin/master)
 > git.exe config core.sparsecheckout # timeout=10
 > git.exe checkout -f 19aaa062749ee90f0043e28fd800f4482743a371 # timeout=10
Commit message: "Merge branch 'master' of https://github.com/leedag/Repository_practice"
 > git.exe rev-list --no-walk 19aaa062749ee90f0043e28fd800f4482743a371 # timeout=10
[Pipeline] }
[Pipeline] // stage
[Pipeline] withEnv
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Build)
[Pipeline] echo
Building...
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Test)
[Pipeline] echo
Testing...
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Deploy)
[Pipeline] echo
Deploying...
[Pipeline] }
[Pipeline] // stage
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
Finished: SUCCESS

