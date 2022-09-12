package com.example.account.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    // Common
    USER_NOT_FOUND("사용자가 존재하지 않습니다."),
    ACCOUNT_NOT_FOUND("계좌가 존재하지 않습니다."),
    USER_ACCOUNT_UN_MATCH("사용자와 계좌의 소유자가 다릅니다."),
    INVALID_REQUEST("잘못된 요청입니다."),
    INTERNAL_SERVER_ERROR("내부 서버 오류가 발생했습니다."),
    ACCOUNT_TRANSACTION_LOCK("해당 계좌는 사용중입니다."),

    // Create Account
    MAX_ACCOUNT_PER_USER_10("사용자 최대 계좌는 10개입니다."),
    DUPLICATED_ACCOUNT_NUMBER("이미 존재하는 계좌번호입니다."),

    // Unregister Account
    ACCOUNT_ALREADY_UNREGISTERED("계좌가 이미 해지되었습니다."),
    ACCOUNT_HAS_BALANCE("잔액이 있는 계좌는 해지할 수 없습니다."),

    // Use Balance
    AMOUNT_EXCEED_BALANCE("거래 금액이 계좌 금액보다 큽니다."),

    // Cancel Balance By Transaction
    TRANSACTION_NOT_FOUND("해당 거래가 존재하지 않습니다."),
    TRANSACTION_ACCOUNT_UN_MATCH("이 거래는 해당 계좌에서 발생한 거래가 아닙니다."),
    CANCEL_MUST_FULLY("부분 취소는 허용되지 않습니다."),
    TOO_OLD_ORDER_TO_CANCEL("1년이 지난 거래는 취소가 불가능합니다.");

    private final String description;
}
