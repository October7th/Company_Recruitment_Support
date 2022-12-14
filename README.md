# Company Recruitment Support
> 회사 채용 지원 사이트

![main](https://user-images.githubusercontent.com/113402301/190563460-491800c5-e702-4b10-a990-d143acdb86da.png)
## 개요

- 개발 기간 : 2022/08/10~2022/08/30
- 주요기능 : 회원가입, 로그인, 지원서 작성(인적사항, 학력, 자격증, 경력, 자기소개서, 파일 업로드), 작성자 목록 확인

## 1. 프로젝트의 목적 및 용도
  <p><b>ㆍ 이 프로젝트는 무엇인가?</b></p>
   - 2주 정도의 기간을 잡고 만들 수 있는 프로젝트를 고민하다가 현재 본인의 주 관심사인 ‘취업’과 관련된 키워드로, **입사 지원 시 필요한 항목들이 담긴 채용 사이트**를 만들었습니다. 
취업 플랫폼이 아닌, 회사와 직접 연결 된 채용 사이트로, 회사에게 도움이 되는 사이트를 개발하려고 노력했습니다.
 지원자가 회원 가입 후 로그인을 하여 지원서를 작성하면 DB에 저장이 되고, 관리자는 관리자 아이디로 접속하면 지원자 목록을 확인할 수 있도록 구상하였습니다. 지원자의 기본 정보 중 주소입력은 Daum의 우편번호 서비스를 이용하였으며,  부트스트랩을 사용하지 않고 html과 css를 제작하였습니다.<br>
<br>  
  <p><b>ㆍ 어떤 사람들이 이 프로젝트를 사용하면 좋은가?</b></p>
   - 회사에서 채용사이트 개발 시 참고하면 좋을 것 같습니다.<br>  
<br>   
  <p><b>ㆍ 이 프로젝트는 어떻게 작동하는가?</b></p>
   - 지원자가 회원가입 후 로그인을 하여 지원서를 작성하면 DB에 저장됩니다.<br>
     관리자는 관리자 아이디로 접속하면 지원자 목록을 확인 할 수 있습니다.<br>


## 2. 프로젝트를 시작하는 방법
  * 개발 환경 <br>
   -사용언어: Java Script <br>
   -프로그램: IntelliJ IDEA <br>
   -서버: apache-tomcat-9.0 <br>
   -DB: Mysql <br>
   -그외: css, html, springboot, JPA, thymeleaf 등
<br/>   

> ERD
<img width="656" alt="image" src="https://user-images.githubusercontent.com/113402301/191402654-cf72d465-8a02-42e3-9a33-1d349741cf0a.png">


## 3. 프로젝트의 사용 범위 및 조건
<p>- 주소 입력은 Daum우편번호 서비스를 사용하였습니다.</p>
<p>- 부트스트랩 없이 손코딩으로 제작하였습니다. 코드를 참고하거나 사용 하실 경우 출처를 밝혀주시면 감사하겠습니다.</p>


## 4. 보완점 및 업데이트 정보
### ㆍ 보완점
##### (1) 회원가입 페이지에서 생년월일, 성별, 이메일, 휴대전화 미입력시 알림창 뜨게 하기
###### → 현재 아이디, 비밀번호, 비밀번호확인, 이름만 적용되어있음
   
##### (2) 회원가입 시 아이디 중복 검사 추가하기
 
##### (3) 회원가입 한 User 정보로 로그인 기능 추가하기
###### → 현재 로그인 기능 없음
   
##### (4) 지원서 작성 step1 인적사항에서 증명사진 업로드 후 이미지 보이게 하기
 
#####  (5) 장애여부, 보훈여부 세부내용 수정하기
###### → 현재 'test'로 작성되어있음
   
##### (6) step4 자기소개서 작성할 때 글자수 오류 고치기
###### → 원래 글자수 나오는데 파일 옮긴 후 1번 문항을 제외하고 글자수가 뜨지않음
   
#####  (7) 지원자 현황 확인이 가능 한 관리자 전용 로그인 만들기
 
##### (8) 관리자모드로 지원자 목록 봤을 때 파일 다운로드 가능하게 만들기

### ㆍ 업데이트 현황
☑　|　수정사항　|　비고　|　날짜　|　버전　|
---|---|---|---|---|
✓|업로드 하기|-|22.09.16|1.0|
　|　|　|　|　|
　|　|　|　|　|


## 5. 상세 이미지

> 회원가입 페이지
<img width="355" alt="image" src="https://user-images.githubusercontent.com/113402301/190567567-d89d5301-452b-4d25-abe8-fd6a18826d74.png">

**DB에 저장 된 화면 : User**

<img width="444" alt="image" src="https://user-images.githubusercontent.com/113402301/190567922-8edea7e1-5e1a-49b7-8802-cc117846bc49.png">



> 로그인 페이지
<img width="433" alt="image" src="https://user-images.githubusercontent.com/113402301/190568038-89c4c42f-1fa2-427c-b554-e42aef5ae853.png">


> STEP01 작성 화면
<img width="1264" alt="image" src="https://user-images.githubusercontent.com/113402301/190565813-e0da7e0e-101d-487c-a56e-1dd156dc2f78.png">
<img width="897" alt="image" src="https://user-images.githubusercontent.com/113402301/190566194-8b2a2307-d13e-4a4a-86f0-7119bd983654.png">

> STEP02 작성 화면
<img width="1276" alt="pj1" src="https://user-images.githubusercontent.com/113402301/190566252-125c4af4-5334-4b78-9e0b-68bf2e181bb1.png">

**DB에 저장 된 화면 : Resume**

<img width="773" alt="image" src="https://user-images.githubusercontent.com/113402301/190567171-0d4a95ea-ed7b-4885-8c46-2ec21c4f1969.png">



> 지원서 작성 완료 페이지

![image](https://user-images.githubusercontent.com/113402301/190570560-d096408e-058e-4549-9f3e-4a360fe38423.png)

> 지원자 목록 페이지 (연습용 예시)

![image](https://user-images.githubusercontent.com/113402301/190570599-7cb1b7d7-004b-4cb2-bf92-53da3d560036.png)



