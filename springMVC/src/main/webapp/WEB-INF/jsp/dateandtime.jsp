<!DOCTYPE html>
<html>
<head>
    <title>Fetch DateTime</title>
    <script>
        function fetchDateTime() {
            fetch('getdataandtime')
                .then(response => {
                    if (!response.ok) {
                        throw new Error("HTTP error " + response.status);
                    }
                    return response.text();
                })
                .then(data => {
                    document.getElementById("datetime").innerText = data;
                })
                .catch(error => {
                    document.getElementById("datetime").innerText = "Error: " + error;
                });
        }
    </script>
</head>
<body>

    <h2>Click the button to get the current date and time</h2>
    <button onclick="fetchDateTime()">Get Date & Time</button>
    <p id="datetime"></p>

</body>
</html>
