const entry = document.getElementById("submit");
entry.addEventListener("click", displayDetails);

function displayDetails(){
    const merchantId = document.getElementById("merchantId").value;
    const TransactionIdType = document.getElementById("TransactionIdType").value;

    console.log("Ashu Singh");

    if(!merchantId || !TransactionIdType){
        alert("Please fill all the details");
        return;
    }
    

    var display = document.getElementById("display");
    var newRow = display.insertRow(1);
    var cell1 = newRow.insertCell(0);
    var cell2 = newRow.insertCell(1);
    
    cell1.innerHTML = merchantId;
    cell2.innerHTML = TransactionIdType;



}