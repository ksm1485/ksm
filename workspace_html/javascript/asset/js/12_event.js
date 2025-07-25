


console.log('hello js')

window.addEventListener('load', init);
// window.onload = init;


function init(){
    const c = document.querySelector('#console')
    console.log( c )

    bind();
}
function bind(){
    const msg = document.querySelector('#console')

    const btn1 = document.querySelector('#btn1')
    btn1.onclick = function(){
        msg.innerHTML += '<br>버튼1 클릭'
    }
    // btn1.onclick = ''
    // onclick은 변수라서 마지막 값만 저장된다

    // addEventListener는 계속 동일 이벤트를 추가할 수 있다
    const btn2 = document.querySelector('#btn2')
    btn2.addEventListener('click', function(){
        msg.innerHTML += '<br>버튼2 클릭'
    })
    // 로그인 버튼을 눌렀을 때
    // 아이디와 비밀번호 비어있지 않다면
    //      아이디, 비밀번호 출력
    // 하나라도 안썼다면
    //      아이디는 필수입니다 또는 비밀번호는 필수입니다
    const login = document.querySelector('#login')
    login.addEventListener('click', function(){
        const id = document.querySelector('#id').value;
        const pw = document.querySelector('#pw').value;

        // debugger;

        console.log('id :', id, id == "")
        if(id == ""){
            msg.innerHTML += '<br>아이디 필수입니다'
        } else if(pw == ""){
            msg.innerHTML += '<br>패스 필수입니다'
        } else {
            msg.innerHTML += `<br>${id}, ${pw}`;
        }
    })

    window.addEventListener('resize',function(){
        console.log('resize')
        console.log(window.innerWidth)
    })

    window.addEventListener('scroll',function(){
        console.log('scrollTop', document.documentElement.scrollTop)
    })

    // document.querySelector('#Top').addEventListener('clck', function(){
    //     document.documentElement.scrollTop = 0
    //     window.scrollTo({
    //         top: 0,
    //         behavior: 'smooth'})
        
    //     })
    
    //     document.documentElement.scrollTop -= 10;
    //      //스크롤탑이 180위치에 있어요
    //     // 0까지 -10씩 바꿀거에요
    //     // 어떻해?
    //     for(let i=document.documentElement.scrollTop; i>=0; i -= 10){
    //         let time = (200 - i) * 10;
    //         setTimeout(function(){
    //             console.log('i :', i, 'time :', time)
    //             document.documentElement.scrollTop = i;
    //         }, time)
    //     }
    };

    

function btnclick(){
    const msg = document.querySelector('#console')
    msg.innerHTML += '<br>btnClick 실행'
}
