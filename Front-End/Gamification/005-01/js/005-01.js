window.onload = function () {

    function onClick() {
        document.querySelector('.modal_wrap_item').style.display = 'block';
        document.querySelector('.modal_black_bg').style.display = 'block';
    }
    function offClick() {
        document.querySelector('.modal_wrap_item').style.display = 'none';
        document.querySelector('.modal_black_bg').style.display = 'none';
    }

    document.getElementById('botton_item').addEventListener('click', onClick);
    document.querySelector('.botton_close_item').addEventListener('click', offClick);

};