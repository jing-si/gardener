// js/common.js
 
// '생성' 버튼에 클릭 이벤트 바인딩
const btn_create = document.getElementById("create_object");
btn_create.addEventListener("click", handleCreateObject);
 
// 마우스 이벤트 추가
document.addEventListener('mousemove', handleObjectDrag);
document.addEventListener('mouseup', handleObjectDrop);