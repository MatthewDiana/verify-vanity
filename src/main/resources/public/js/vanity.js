$(document).ready(function() {
    $('#checkButton').click(function() {
        $('#checkButton').prop('disabled', true).html('<i class="fa fa-refresh fa-spin fa-fw"></i> Checking...');
        $('#checkResult').empty();
        $.get('/check?plateNum=' + $('#licensePlateNum').val() + "&state=ny").done(function(license) {
            if (license.available) {
                $('<div class="alert alert-success" role="alert">This license plate is available!</div>')
                    .appendTo('#checkResult');
            } else {
                $('<div class="alert alert-danger" role="alert">This license plate is not available.</div>')
                    .appendTo('#checkResult');
            }
            $('#checkButton').prop('disabled', false).html('Check');
        });
    });
});

