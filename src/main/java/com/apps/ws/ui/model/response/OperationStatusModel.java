package com.apps.ws.ui.model.response;

public class OperationStatusModel {
    private String operationName;
    private String operationResult;

    public OperationStatusModel() {
    }

    public String getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(String operationStatus) {
        this.operationResult = operationStatus;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }
}
