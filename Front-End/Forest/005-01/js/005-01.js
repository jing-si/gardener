window.onload = function () {

    function onClick() {
        document.querySelector('.modal_wrap').style.display = 'block';
        document.querySelector('.modal').style.display = 'block';
    }
    function offClick() {
        document.querySelector('.modal_wrap').style.display = 'none';
        document.querySelector('.modal').style.display = 'none';
    }

    document.getElementById('botton_item').addEventListener('click', onClick);
    document.querySelector('.botton_close_item').addEventListener('click', offClick);

};